package main

import "bufio"
import "fmt"
import "os"
import "time"

func main() {
    fmt.Println("\n  ***            Percent Complete                ***")
    fmt.Println("  |                                                |")
    fmt.Println("  0%                     50%                    100%")
    fmt.Println("  |                                                |")
    fmt.Printf("  ")
    
    bufstdout := bufio.NewWriter(os.Stdout)
    the_stars := 0
    for the_stars < 50 {
        the_stars += 1
        fmt.Fprint(bufstdout, "*")
        bufstdout.Flush()
        time.Sleep(100 * time.Millisecond)
    }
    fmt.Println("\n")

}
