
fun main(args : Array<String>) {
	println("   ***                   Percent Complete                   ***")
	println("   |                                                          |")
	println("   0%                         50%                          100%")
	println("   |                                                          |")
	print("   ")
	
	for (nums in 0..59) {
		Thread.sleep(300)
		print("*")
	}
	print("\n")
}
