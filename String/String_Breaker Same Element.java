public class StringBreaker {
    public static void main(String[] args) {
        String input = "hellohello"; // Example string
        String[] segments = new String[input.length()]; // Array to store segments
        String currentSegment = "";
        int breakCount = 0;
        int segmentIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            //charAt is used to check index element
            char currentChar = input.charAt(i);

            // If current segment contains the character, break the segment
            if (currentSegment.indexOf(currentChar) != -1) {
                segments[segmentIndex++] = currentSegment; // Store segment in array
                currentSegment = ""; // Reset the current segment
                breakCount++;
            }
            currentSegment += currentChar;
        }

        // Add the last segment if it's not empty
        if (!currentSegment.isEmpty()) {
            segments[segmentIndex++] = currentSegment;
        }

        // Print the segments and break count
        System.out.print("Segments: ");
        for (int i = 0; i < segmentIndex; i++) {
            System.out.print(segments[i] + " ");
        }
        System.out.println("\nNumber of breaks: " + breakCount);
    }
}
