import java.util.Scanner;

public class ChatBot {

    public static String getResponse(String input) {
        input = input.toLowerCase().trim();

        // Basic NLP: keyword-based understanding
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        }
        else if (input.contains("your name")) {
            return "I am CodeAlpha AI Chatbot.";
        }
        else if (input.contains("how are you")) {
            return "I'm doing great! Thanks for asking 😊";
        }
        else if (input.contains("what is java")) {
            return "Java is a high-level, object-oriented programming language.";
        }
        else if (input.contains("internship")) {
            return "This chatbot is created as part of the CodeAlpha Internship.";
        }
        else if (input.contains("help")) {
            return "You can ask me about Java, internships, or general questions.";
        }
        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! Have a great day 🚀";
        }
        else {
            return "Sorry, I didn't understand that. Can you rephrase?";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 CodeAlpha AI Chatbot");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
