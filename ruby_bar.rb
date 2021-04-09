#!/usr/bin/ruby

print "\n  ***            Percent Complete                ***\n"
print "  |                                                |\n"
print "  0% ################## 50% ################### 100%\n"
print "  |                                                |\n"

print "  "
sleep(0.5)
the_stars = 0...50
the_stars.each do
    STDOUT.putc "*"
    STDOUT.flush()
    sleep(0.1)
end
print "\n\n"
