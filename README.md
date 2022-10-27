# Oblig3

Det første jeg gjorde var å endre fra intellij til VScode for å enklere kunne snakke med GitHub.
Deretter lastet jeg ned git setup slik at jeg kan kjøre git komandoer i terminalen på VSC. 

da jeg kjørte den første git commit'en fikk jeg error meldinger pga en skrivefeil. noe som var enkelt å fikse da jeg fant det.

Neste error jeg fikk var exit code 126. dette oppstår når gradlew filen ikke har tilgang til git repository og ikke er executable.
Her måtte jeg skrive inn kommandoene:
  ``` git update-index --chmod=+x gradlew ```
Og la til en beskrivelse av hva jeg har gjort.
  ``` git commit -m "Make gradlew executable" ```
  
Da dette var gjort fikk jeg godkjente tester og github var fornøyd med filene mine. 

Som oppgaven ba om la jeg til:
  ``` 
  testLogging {
      events "passed", "skipped", "failed", "standardOut", "standardError"
} 
``` 


for å se at testene kjøres på github også.

Det siste jeg gjorde var å gjøre en bevisst feil slik at jeg kunne se om GitHub reagerte på det. noe det gjorde. Deretter endra jeg tilbake for å fikse det og at alle testene kjørtes riktig.
