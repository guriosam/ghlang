package interpreter;

import java.util.List;

import utils.Checker;

public class Interpreter {

	private List<String> commands;
	private List<String> code;
	private String output;

	public Interpreter(List<String> commands, List<String> code) {
		this.commands = commands;
		this.output = "";

		addImports();
		addMethods();

		this.code = code;
	}

	public void analyze() {

		int i = 0;
		String auxType = "";

		String lastCode = "";

		boolean declaration = false;
		boolean forBody = false;
		boolean apiCall = false;
		boolean isList = false;

		for (String command : commands) {

			switch (Checker.check(command.trim())) {

			// case main:
			// output += "main ";
			// break;
			case id:
				output += code.get(i);
				lastCode = code.get(i);

				if (!code.get(i).contains(".")) {
					if (declaration) {
						if (!forBody) {

							output += " = new " + auxType.trim() + "();\n";

							if (auxType.trim().equals("GHString")) {
								output += "\t" + code.get(i) + ".string";
							} else if (auxType.trim().equals("Int")) {
								output += "\t" + code.get(i) + ".value";
							} else if (auxType.trim().equals("GHFloat")) {
								output += "\t" + code.get(i) + ".value";
							} else {
								output += "\t" + code.get(i);
							}
						}
					}

					if (isList) {
						output += ".elements";
					}
				}

				declaration = false;
				forBody = false;
				isList = false;

				break;
			// case tVoid:
			// output += "public static void ";
			// break;
			case tInt:
				output += "Int ";
				declaration = true;
				auxType = "Int ";
				break;
			case tInts:
				output += "Ints ";
				declaration = true;
				auxType = "Ints ";
				break;
			case tFloat:
				output += "GHFloat ";
				declaration = true;
				auxType = "Float ";
				break;
			case tFloats:
				output += "Floats ";
				declaration = true;
				auxType = "Floats ";
				break;
			case tString:
				output += "GHString ";
				declaration = true;
				auxType = "GHString ";
				break;
			case tStrings:
				output += "Strings ";
				declaration = true;
				auxType = "Strings ";
				break;
			case tBool:
				output += "Bool ";
				declaration = true;
				auxType = "Bool ";
				break;
			case tBools:
				output += "Bools ";
				declaration = true;
				auxType = "Bools ";
				break;
			case tCommit:
				output += "Commit ";
				declaration = true;
				auxType = "Commit ";
				break;
			case tCommits:
				output += "Commits ";
				declaration = true;
				auxType = "Commits ";
				break;
			case tUser:
				output += "User ";
				declaration = true;
				auxType = "User ";
				break;
			case tUsers:
				output += "Users ";
				declaration = true;
				auxType = "Users ";
				break;
			case tRepository:
				output += "Repository ";
				declaration = true;
				auxType = "Repository ";
				break;
			case tRepositories:
				output += "Repositories ";
				declaration = true;
				auxType = "Repositories ";
				break;
			case tFile:
				output += "GHFile ";
				declaration = true;
				auxType = "GHFile ";
				break;
			case tFiles:
				output += "Files ";
				declaration = true;
				auxType = "Files ";
				break;
			case tIssue:
				output += "Issue ";
				declaration = true;
				auxType = "Issue ";
				break;
			case tIssues:
				output += "Issues ";
				declaration = true;
				auxType = "Issues ";
				break;
			case tPullRequest:
				output += "PullRequest ";
				declaration = true;
				auxType = "PullRequest ";
				break;
			case tPullRequests:
				output += "PullRequests ";
				declaration = true;
				auxType = "PullRequests ";
				break;
			case tComment:
				output += "Comment ";
				declaration = true;
				auxType = "Comment ";
				break;
			case tComments:
				output += "Comments ";
				declaration = true;
				auxType = "Comments ";
				break;
			case tDate:
				output += "GHDate ";
				declaration = true;
				auxType = "GHDate ";
				break;
			case tDates:
				output += "Dates ";
				declaration = true;
				auxType = "Dates ";
				break;
			case tSize:
				output += "HattoriSize ";
				declaration = true;
				auxType = "HattoriSize ";
				break;
			case tNature:
				output += "HattoriNature ";
				declaration = true;
				auxType = "HattoriNature ";
				break;
			case escStart:
				output += "{\n\n\t";
				break;
			case escEnd:
				output += "}\n\n";
				break;
			case paramStart:
				output += "(";

				if (apiCall) {
					output += "args[0], ";
				}
				apiCall = false;

				break;
			case paramEnd:
				output += ")";
				break;
			case cmt:
				output += "//";
				break;
			case term:
				output += ";\n\n\t";
				break;
			case point:
				output += ".";
				break;
			case in:
				isList = true;
				output += " : ";
				break;
			// case prRead:
			/// TODO
			// output +=
			// break;
			case prWrite:
				output += "System.out.println";
				break;
			case prIf:
				output += "if";
				break;
			case prElse:
				output += "else";
				break;
			case prWhile:
				output += "while";
				break;
			case prFor:
				forBody = true;
				output += "for";
				break;
			case prReturn:
				output += "return";
				break;
			case opAtrib:
				output += " = ";
				break;
			case opIncre:
				if (code.get(i).equals("++")) {
					output += "++";
				} else {
					output += "--";
				}
				break;
			case opLogicAnd:
				output += " && ";
				break;
			case opLogicOr:
				output += " || ";
				break;
			case opLogicNeg:
				output += " !";
				break;
			case opAritAd:
				if (code.get(i).equals("+")) {
					output += "+";
				} else {
					output += "-";
				}
				break;
			case opAritMul:
				if (code.get(i).equals("*")) {
					output += "*";
				} else if (code.get(i).equals("/")) {
					output += "/";
				} else {
					output += "%";
				}
				break;
			case opNegUn:
				output += "-";
				break;
			case opRel1:
				if (code.get(i).equals(">")) {
					output += " > ";
				} else if (code.get(i).equals("<")) {
					output += " < ";
				}
				break;
			case opRel2:
				if (code.get(i).equals(">=")) {
					output += " >= ";
				} else if (code.get(i).equals("<=")) {
					output += " <= ";
				}
				break;
			case opRel3:
				if (code.get(i).equals("==")) {
					output += " == ";
				} else if (code.get(i).equals("!=")) {
					output += " != ";
				}
				break;
			case opConc:
				output += "+=";
				break;
			case opAccess:
				output += ".";
				break;
			case tUnknown:
				// Analisar
				output += "\n//Unknown: " + code.get(i) + "\n";
				break;
			case fAdd:
				output += "add";
				break;
			case fAnalyzeC:
				// TODO
				output += "analyze_commit";
				break;
			case fAnalyzeCs:
				// TODO
				output += "analyze_commits";
				break;
			case fCollectData:
				apiCall = true;
				output += lastCode + ".collectData";
				lastCode = "";
				break;
			case fCompare:
				output += "compare";
				break;
			case fDiffDates:
				output += "diffDates";
				break;
			case fLength:
				output += "size";
				break;
			case fLower:
				output += "toLower";
				break;
			case fRemove:
				output += "remove";
				break;
			case fReverse:
				output += "reverse";
				break;
			case fSplit:
				output += "split";
				break;
			case fUpper:
				output += "toUpper";
				break;
			case tLitString:
				output += code.get(i);
				break;
			case tLitInt:
				output += code.get(i);
				break;
			case tLitFloat:
				output += code.get(i);
				break;
			case tLitBool:
				output += code.get(i);
				break;
			case comma:
				output += ",";
				break;
			}

			i++;
		}

		output += "}\n\n}";

	}

	private void addMethods() {
		// TODO OUTROS MÉTODOS
		output += "\tpublic static void main(String[] args){\n\n\t";

	}

	private void addImports() {

		output += "package temp;\n";
		// System
		output += "import java.util.List;\n";
		output += "import java.util.ArrayList;\n";
		// output += "import java.util.Scanner;\n";

		// Objects
		output += "import dsl_objects.Bool;" + "\n";
		output += "import dsl_objects.Bools;" + "\n";

		output += "import dsl_objects.Comment;" + "\n";
		output += "import dsl_objects.Comments;" + "\n";

		output += "import dsl_objects.Commit;" + "\n";
		output += "import dsl_objects.Commits;" + "\n";

		output += "import dsl_objects.GHDate;" + "\n";
		output += "import dsl_objects.Dates;" + "\n";

		output += "import dsl_objects.GHFile;" + "\n";
		output += "import dsl_objects.Files;" + "\n";

		output += "import dsl_objects.GHFloat;" + "\n";
		output += "import dsl_objects.Floats;" + "\n";

		output += "import dsl_objects.Int;" + "\n";
		output += "import dsl_objects.Ints;" + "\n";

		output += "import dsl_objects.Issue;" + "\n";
		output += "import dsl_objects.Issues;" + "\n";

		output += "import dsl_objects.PullRequest;" + "\n";
		output += "import dsl_objects.PullRequest;" + "\n";

		output += "import dsl_objects.Repository;" + "\n";
		output += "import dsl_objects.Repositories;" + "\n";

		output += "import dsl_objects.GHString;" + "\n";
		output += "import dsl_objects.Strings;" + "\n";

		output += "import dsl_objects.User;" + "\n";
		output += "import dsl_objects.Users;" + "\n\n";

		output += "public class GHCode {\n\n";

	}

	public String getOutput() {
		return this.output;
	}
}
