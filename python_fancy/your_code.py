#!/usr/bin/python3

import your_bar
from time import sleep

#Example loop to put your bar

your_bar.start_it()

for a in range(50):
    your_bar.add_star()
    sleep(0.1)

your_bar.end_it()
