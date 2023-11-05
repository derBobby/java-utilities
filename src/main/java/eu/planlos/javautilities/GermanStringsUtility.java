package eu.planlos.javautilities;

@SuppressWarnings("unused")
public class GermanStringsUtility {

    public static String normalizeGermanCharacters(String text) {
        return text
                .replaceAll("ä", "ae")
                .replaceAll("ö", "oe")
                .replaceAll("ü", "ue")
                .replaceAll("Ä", "Ae")
                .replaceAll("Ö", "Oe")
                .replaceAll("Ü", "Ue")
                .replaceAll("ß", "ss");
    }
}