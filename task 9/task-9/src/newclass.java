public class newclass {

    public static void main(String[] args) {

        String[] texts = {
                "Today is a bright and sunny day.",
                "The sky is blue without any clouds.",
                "I can see people walking in the park.",
                "The birds are singing happily on the trees.",
                "It is a perfect time to go to the beach.",
                "I am wearing my favorite t-shirt and glasses.",
                "I feel very energetic and positive today.",
                "The sun shines warmly on my skin.",
                "I love summer, it is my favorite season.",
                "I think I will go for a walk later."
        };

        for(int i = 0; i < 10; i++) {

            var task = new myThread(texts[i]);
            new Thread(task).start();

        }

    }

}