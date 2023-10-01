package ru.egar.homeProject.dock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.egar.homeProject.dictionary.Dictionary;
import ru.egar.homeProject.dictionary.IdentityDocumentType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryTest {

    @DisplayName("Првоерка соответсвия кода")
    @Test
    void check02Dictionary() {
        List<IdentityDocumentType> iD = Dictionary.identityDocuments();
        Map<String, IdentityDocumentType> mapIdentityDock = new HashMap<>();
        for (IdentityDocumentType item : iD) {
            mapIdentityDock.put(item.getCode(), item);
        }
        Assertions.assertEquals("Passport", iD.get(0).getName());

    }


}
