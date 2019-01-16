package start;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import interpreter.Interpreter;
import utils.IO;

public class Main {

	@Parameter(names = "--code", description = "Path to the input code", order = 1)
	private String pathCode = "";

	@Parameter(names = "--tokens", description = "Path to the input tokens", order = 2)
	private String pathTokens = "";

	@Parameter(names = "--output", description = "Path to the output folder", order = 3)
	private String pathOut = "";

	public static void main(String[] args) throws IOException {

		Main main = new Main();
		JCommander jCommander = new JCommander(main, args);
		main.run(jCommander);

	}

	private void run(JCommander jCommander) {

		try {

			List<String> commands = new ArrayList<>();
			List<String> code = new ArrayList<>();
			
			commands = IO.readAnyFile(pathTokens);
			code = IO.readAnyFile(pathCode);

			Interpreter interpreter = new Interpreter(commands, code);
			interpreter.analyze();

			IO.writeAnyString(pathOut + "/GHCode.java", interpreter.getOutput());

			File f = new File(pathTokens);
			f.delete();
			File f2 = new File(pathCode);
			f2.delete();

			//String[] args = new String[1];
			//args[0] = pathOut;

			//FrameworkMain.main(args);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
