MAIN = Driver
FILES = $(MAIN).java Maze.java Solver.java Dictionary.java

Driver.class : $(FILES)
	@echo -n Compiling project... 
	@javac $(MAIN).java || echo -e \n
	@echo -n Done

run :
	@echo -n Executing program...\n
	@java $(MAIN)
	@echo -n -e \nFinished\n

clean :
	@echo -n Cleaning...
	@rm -rf *.class
	@echo Done
