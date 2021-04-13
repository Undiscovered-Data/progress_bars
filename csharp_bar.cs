using System;
using System.Threading;

namespace ProgressBar
{
    class Bar {
	    static void Main(string[] args)
		{
            System.Console.WriteLine("\n  ***            Percent Complete                ***");
            System.Console.WriteLine("  |                                                |");
            System.Console.WriteLine("  0%                     50%                    100%");
            System.Console.WriteLine("  |                                                |");
            System.Console.Write("  ");

			for (int i = 0; i < 50; i++)
			{
			    System.Console.Write("*");
			    Thread.Sleep(100);
			}
            System.Console.WriteLine("\n");
		}
	}
}
