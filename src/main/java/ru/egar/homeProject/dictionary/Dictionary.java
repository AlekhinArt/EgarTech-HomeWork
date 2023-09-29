package ru.egar.homeProject.dictionary;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Реестор документов
public class Dictionary {

    public static List<IdentityDocumentType> identityDocuments() {

        List<IdentityDocumentType> identityDocumentTypes = Stream.of(
                        new IdentityDocumentType("01", "Passport"),
                        new IdentityDocumentType("02", "non passport"),
                        new IdentityDocumentType("03", "kasual doc"),
                        new IdentityDocumentType("04", "may be dock"),
                        new IdentityDocumentType("05", "example dock"))
                .collect(Collectors.toList());
        return identityDocumentTypes;
    }
}
