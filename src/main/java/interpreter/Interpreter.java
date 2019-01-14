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
		for (String command : commands) {

			switch (Checker.check(command.trim())) {

			//case main:
				//output += "main ";
			//	break;
			case id:
				output += code.get(i);
				break;
			//case tVoid:
			//	output += "public static void ";
			//	break;
			case tInt:
				output += "Ints ";
				break;
			case tInts:
				output += "Ints ";
				break;
			case tFloat:
				output += "Float ";
				break;
			case tFloats:
				output += "Floats ";
				break;
			case tString:
				output += "GHString ";
				break;
			case tStrings:
				output += "Strings ";
				break;
			case tBool:
				output += "Bool ";
				break;
			case tBools:
				output += "Bools ";
				break;
			case tCommit:
				output += "Commit ";
				break;
			case tCommits:
				output += "Commits ";
				break;
			case tUser:
				output += "User ";
				break;
			case tUsers:
				output += "Users ";
				break;
			case tRepository:
				output += "Repository ";
				break;
			case tRepositories:
				output += "Repositories ";
				break;
			case tFile:
				output += "GHFile ";
				break;
			case tFiles:
				output += "Files ";
				break;
			case tIssue:
				output += "Issue ";
				break;
			case tIssues:
				output += "Issues ";
				break;
			case tPullRequest:
				output += "PullRequest ";
				break;
			case tPullRequests:
				output += "PullRequests ";
				break;
			case tComment:
				output += "Comment ";
				break;
			case tComments:
				output += "Comments ";
				break;
			case tDate:
				output += "GHDate ";
				break;
			case tDates:
				output += "Dates ";
				break;
			case escStart:
				output += "{\n\t";
				break;
			case escEnd:
				output += "}\n";
				break;
			case paramStart:
				output += "(";
				break;
			case paramEnd:
				output += ")";
				break;
			case cmt:
				output += "//";
				break;
			case term:
				output += ";\n\t";
				break;
			case point:
				output += ".";
				break;
			case in:
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
			case fRemove:
				output += "remove";
				break;
			case fUpper:
				output += "toUpper";
				break;
			case fLower:
				output += "toLower";
				break;
			case fCollectData:
				output += "collectData";
				break;
			case fRefresh:
				// TODO
				output += "refresh";
				break;
			case fDiffDates:
				// TODO
				output += "diffDates";
				break;
			case fLength:
				output += "size";
				break;
			case fCompare:
				output += "equals";
				break;
			case fReverse:
				output += "reverse";
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
		
		output += "}";
		System.out.println(output);

	}

	private void addMethods() {
		//TODO OUTROS MÉTODOS
		output += "public static void main(String[] args){\n\n\t";
		
	}

	private void addImports() {

		//System
		output += "import java.util.List;\n";
		output += "import java.util.ArrayList;\n";
		//output += "import java.util.Scanner;\n";

		//Objects
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
		
		output += "import dsl_objects.Float;" + "\n";
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
				
		
	}
	
}
