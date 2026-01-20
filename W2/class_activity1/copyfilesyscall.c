#include <unistd.h>
#include <fcntl.h>
#include <stdio.h>

int main() {
    int in, out;
    char buf[1024];
    int n;

    in = open("result.txt", O_RDONLY);
    out = open("copyresult.txt", O_WRONLY | O_CREAT | O_TRUNC, 0644);

    while ((n = read(in, buf, sizeof(buf))) > 0) {
        write(out, buf, n);
    }

    close(in);
    close(out);

    return 0;
}

