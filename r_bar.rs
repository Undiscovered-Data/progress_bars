use std::io::{self, Write};
use std::{thread, time};

fn main() {
    println!("\n  ***            Percent Complete                ***");
    println!("  |                                                |");
    println!("  0%                    50%                        |");
    println!("  |                                                |");
    print!("  ");

    let tenth_second = time::Duration::from_millis(100);
    for _a in 0..50 {
        print!("*");
        io::stdout().flush().unwrap();
        thread::sleep(tenth_second);
    }

    print!("\n\n");
}
