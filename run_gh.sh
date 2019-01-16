java -jar libs/gh_compiler_run.jar --code test_codes/test_comment.gh --output temp/ --action files/action.csv --transition files/goto.csv --grammar files/gh_grammar.txt

java -jar libs/gh_interpreter_run.jar --code temp/code.txt --tokens temp/tokens.txt --output temp/

rm temp/GHCode.class

javac -cp libs/gh_interpreter_run.jar temp/GHCode.java 

jar uf libs/gh_lang.jar temp/GHCode.class

java -jar libs/gh_lang.jar temp\\