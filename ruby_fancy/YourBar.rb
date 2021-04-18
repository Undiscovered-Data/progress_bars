#!/usr/bin/ruby

class YourBar
    def self.start_it()
        print "\n  ***            Percent Complete                ***\n"
        print "  |                                                |\n"
        print "  0% ################## 50% ################### 100%\n"
        print "  |                                                |\n"
        print "  "
    end

    def self.add_star()
        print "*"
    end

    def self.end_it()
        print "\n\n"
    end
end
