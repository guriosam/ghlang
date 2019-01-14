package start;

import java.util.ArrayList;
import java.util.List;

import endpoints.CommitsAPI;
import interpreter.Interpreter;
import utils.IO;

public class Main {

	public static void main(String[] args) {

		// String file = args[0];

		// Going through the lexical and syntactic analyzer.
		List<String> commands = new ArrayList<>();
		List<String> code = new ArrayList<>();
		
		commands = IO.readAnyFile("temp/tokens.txt");
		code = IO.readAnyFile("temp/code.txt");

		Interpreter interpretor = new Interpreter(commands, code);
		interpretor.analyze();

	}

	public void collectCommitData(String url) {
		String project = url.substring(url.indexOf("/"));
		CommitsAPI.downloadAllCommits(project, url);
	}
	
}
