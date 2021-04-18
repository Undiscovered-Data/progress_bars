#!/usr/bin/ruby

require_relative "YourBar"

YourBar.start_it

the_stars = 0...50
the_stars.each do
    YourBar.add_star
    sleep(0.1)
end

YourBar.end_it
