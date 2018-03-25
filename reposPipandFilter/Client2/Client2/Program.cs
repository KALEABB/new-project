using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Client2
{
	class Program
	{
		static void Main(string[] args)
		{
			IMessage message = new Message(messageId: "1",
				body: "This is the message body",
				header: "Header Information",
				subject: "Please set priority and encrypt the message");

			//sending code to the pipeline and the message is encrypted and published into the queue  
			SendPipeline sendPipeline = new SendPipeline(true, false);
			var publishedMessage = sendPipeline.PerformOperation(message);
			Console.WriteLine("I am client2 and my messages should only be prioritized and not encrypted!!!");
			Console.WriteLine("My message Priority Set? {0}", publishedMessage.IsMessagePrioritySet());
			Console.WriteLine("My message Encrypted? {0}", publishedMessage.IsMessageEncrypted());
			Console.WriteLine();

			Console.Read();
		}
	}
}
