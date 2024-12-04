# Makefile to generate README.md

README.md: guessinggame.sh
	@echo "# Guessing Game" > README.md
	@echo "This is a simple guessing game where the user guesses the number of files in the current directory." >> README.md
	@echo "" >> README.md
	@echo "## Date and Time" >> README.md
	@date >> README.md
	@echo "" >> README.md
	@echo "## Lines of Code" >> README.md
	@wc -l < guessinggame.sh >> README.md
