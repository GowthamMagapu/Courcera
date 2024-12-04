#!/bin/bash

# Function to count the number of files
count_files() {
    echo $(ls -1 | wc -l)
}

# Start the game
echo "Welcome to the guessing game!"
file_count=$(count_files)
guess=0

# Loop until the user guesses correctly
while [ $guess -ne $file_count ]; do
    echo "How many files are in the current directory?"
    read guess
    
    if [ $guess -lt $file_count ]; then
        echo "Your guess is too low. Try again."
    elif [ $guess -gt $file_count ]; then
        echo "Your guess is too high. Try again."
    else
        echo "Congratulations! You guessed it right!"
    fi
done
