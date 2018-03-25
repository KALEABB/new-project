
using PipesAndFiltersExample;
using System;

namespace Client1
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
			SendPipeline sendPipeline = new SendPipeline(true, true);
			var publishedMessage = sendPipeline.PerformOperation(message);
			Console.WriteLine("I am client1 and my messages should be prioritized and encrypted!!!");
			Console.WriteLine("My message Priority Set? {0}", publishedMessage.IsMessagePrioritySet());
			Console.WriteLine("My message Encrypted? {0}", publishedMessage.IsMessageEncrypted());
			Console.WriteLine();

			Console.Read();
		}
	}
}