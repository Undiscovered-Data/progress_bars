#!/usr/bin/python3

import sys
from time import sleep

print("  ***            Percent Complete                ***")
print("  |                                                |")
print("  0% ################## 50% ################### 100%")
print("  |                                                |")
sys.stdout.write("  ")
sys.stdout.flush()
for a in range(50):
    sys.stdout.write("@")
    sys.stdout.flush()
    sleep(0.3)

sys.stdout.write('\n')

