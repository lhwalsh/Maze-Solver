MAIN = Driver
FILES = $(MAIN).java Maze.java Solver.java WordBank.java

Driver.class : $(FILES)
	@echo -n Compiling project... 
	@javac $(MAIN).java
	@echo -n Done

run :
	@echo -n -e Executing program...\n
	@java $(MAIN)
	@echo -n -e \nFinished\n

clean :
	@echo -n Cleaning...
	@rm -rf *.class
	@echo Done

git :
	@echo Adding everything to git...
	@git 
