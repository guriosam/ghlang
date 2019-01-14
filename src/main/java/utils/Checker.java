package utils;

import lexical.LexicalTable;
import lexical.Tokens;

public class Checker {

	public static Tokens check(String command) {

		//System.out.println(command);
		
		for(String k : LexicalTable.lexemMap.keySet()){
			if(command.equals(LexicalTable.lexemMap.get(k).toString())){
				//System.out.println(LexicalTable.lexemMap.get(k).toString());
				return LexicalTable.lexemMap.get(k);
			}
		}
		
		//System.out.println("tUnknown");
		return Tokens.tUnknown;

	}

}
