public class Duke {
    private String commandType = "";

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        // This tutorial app echoes messages; classify the first word for GUI styling only.
        String command = input.strip().split("\\s+", 2)[0];
        commandType = switch (command) {
        case "todo", "deadline", "event" -> "AddCommand";
        case "mark", "unmark" -> "ChangeMarkCommand";
        case "delete" -> "DeleteCommand";
        default -> "";
        };
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
