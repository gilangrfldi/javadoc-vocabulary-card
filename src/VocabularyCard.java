/**
 * Merepresentasikan sebuah kartu kosakata bahasa Jepang dalam sistem pembelajaran berbasis permainan.
 * Setiap kartu berisi kata dalam huruf Jepang, pelafalan (romaji), arti, contoh kalimat, dan tingkat kesulitan.
 * Kelas ini dirancang untuk mendukung sistem adaptif ringan dalam media pembelajaran bahasa Jepang.
 */
public class VocabularyCard {
    private String japaneseWord;
    private String romaji;
    private String meaning;
    private String exampleSentence;
    private int difficulty;

    /**
     * Membuat objek VocabularyCard baru dengan data lengkap.
     *
     * @param japaneseWord kata dalam aksara Jepang (kanji/hiragana)
     * @param romaji cara baca dalam alfabet Latin
     * @param meaning arti kata dalam bahasa Indonesia atau Inggris
     * @param exampleSentence contoh kalimat penggunaan kata
     * @param difficulty tingkat kesulitan (1–5)
     * @throws IllegalArgumentException jika difficulty tidak berada di antara 1–5
     */
    public VocabularyCard(String japaneseWord, String romaji, String meaning,
                          String exampleSentence, int difficulty) {
        if (difficulty < 1 || difficulty > 5) {
            throw new IllegalArgumentException("Tingkat kesulitan harus antara 1 dan 5.");
        }
        this.japaneseWord = japaneseWord;
        this.romaji = romaji;
        this.meaning = meaning;
        this.exampleSentence = exampleSentence;
        this.difficulty = difficulty;
    }

    /**
     * Mengembalikan kata dalam bahasa Jepang.
     *
     * @return string berisi kata dalam aksara Jepang
     */
    public String getJapaneseWord() {
        return japaneseWord;
    }

    /**
     * Mengembalikan tingkat kesulitan kartu.
     *
     * @return nilai integer antara 1–5
     */
    public int getDifficulty() {
        return difficulty;
    }

        /**
     * Mengembalikan pelafalan kata dalam alfabet Latin (romaji).
     *
     * @return string berisi romaji dari kata Jepang
     */
    public String getRomaji() {
        return romaji;
    }

    /**
     * Mengembalikan arti kata dalam bahasa Indonesia atau Inggris.
     *
     * @return string berisi arti kata
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Mengembalikan contoh kalimat penggunaan kata dalam bahasa Jepang.
     *
     * @return string berisi contoh kalimat
     */
    public String getExampleSentence() {
        return exampleSentence;
    }
}