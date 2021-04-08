#include <stdio.h>
#include <unistd.h>


int main(void) {
    int x;
    printf("\n");
    printf("%2c***%14cPercent Complete%14c***\n", ' ', ' ', ' ');
    printf("%2c|%48c|\n", ' ', ' ');
    printf("%2c0%3c###############%4c50%4c###############%3c100\n", ' ', ' ',
        ' ', ' ', ' ');
    printf("%2c|%48c|\n", ' ', ' ');
    printf("%2c", ' ');
    fflush(stdout);
    for (x = 0; x < 50; x++) {
        usleep(100000);
        printf("*");
        fflush(stdout);
        //sleep(1);
    }
    printf("\n\n");
}

