#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid;

    // Create a child process
    pid = fork();

    if (pid < 0) {
        // Fork failed
        perror("Fork failed");
        exit(1);
    } else if (pid == 0) {
        // Child process
        // Execute ls using execlp
        execlp("ls", "ls", NULL);

        // If exec fails
        perror("execlp failed");
        exit(1);
    } else {
        // Parent process
        wait(NULL);  // Wait for child to finish
    }

    return 0;
}
