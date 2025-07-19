package StreamAPI.TheBasics.HowToCreate.TheFifthDay.Homework;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ListService {
    StreamRealization realization = new StreamRealization();

    public CompletableFuture<Boolean> processInfoClient(String userInput) {
        return CompletableFuture.supplyAsync(() -> {
            List<PersonNames> clientInfo = List.of(
                    new PersonNames(List.of("something@maks")),
                    new PersonNames(List.of("something@artem")),
                    new PersonNames(List.of("something@maks")),
                    new PersonNames(List.of("something@elia")),
                    new PersonNames(List.of("something@alice")),
                    new PersonNames(List.of("something@alice")),
                    new PersonNames(List.of("something@joan")),
                    new PersonNames(List.of("something@adiolla")),
                    new PersonNames(List.of("something@alina"))
            );

            List<String> allEmails = realization.puttingIntoTheStream(clientInfo);
            List<String> domains = realization.filteredList(allEmails);
            List<String> filteredDomains = realization.upperCaseFilteredList(domains);
            List<String> uniqueDomains = realization.duplicatesFilteredList(filteredDomains);
            List<String> finalList = realization.finalSortedList(uniqueDomains);

            System.out.println("finalList: " + finalList);

            if (!finalList.isEmpty()) {
                String correctPassword = finalList.get(0);
                return correctPassword.equalsIgnoreCase(userInput);
            }
            return false;
        });
    }
}
