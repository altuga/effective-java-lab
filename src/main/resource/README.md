
- q01
   - Constructor 
        - artılar
            - final ile immutable yaklaşımını kullanabildik
            - İş kurallarını uygulayabildim
        - eksiler
            - Okunabilirliği az 
            - Hata yapma şansı yüksek - DDD
   - Get/setter
       - artılar
         - Okunabilir
       - eksiler
         - final yok oldu, immutable yok 
         - İş kurallarını uygulayamıyorum.
    - Builder pattern
        -  NutritionFacts nutritionFacts = new Builder(10,20).calories(20).fat(40).build
    
2021-12-13 notlar

- static method stateless - para çokomel
- primitive type hızldır. 
- Wrapper ları dikkatli kullanalım
  - Long , Double , ... utility metodlar
- System.nanoTime - accurent zaman alırsın
  
- toString() ezin (overload)
- Lombok - hiç kullanmayın
- Kotlin + Java - ile Lombok tadında obilir.
- standartlar şaşmayın. 
-

- https://wiki.sei.cmu.edu/confluence/display/java/MET12-J.+Do+not+use+finalizers

- https://dev.to/trekhleb/s-o-l-i-d-principles-around-you-1o17

- para pul --> BigDecimal

- Immutable kısıt ile yönetibilir -> multi thread . 
- hashcode + equals  beraber override ediniz.
- System.gc --> XXXXXXX 
- try with resource kullanın, kullanırttırınn.
- anti-corruption layer  --> önemli 
- abstract sınıfın içerisiden abstract method çağırma 
- Value Object --> Immutable --> DDD --> Tactical tarafı
- Müşterinin adresi 
- Müşterinin hesabı 
- Cohession -->Alakalılık
- SOLID 
- Theory of constraints
  
- cyclomatic complexity


- https://en.wikipedia.org/wiki/Composition_over_inheritance
- https://en.wikipedia.org/wiki/Heap_pollution
- Composition over inheritance 
- foreach kullanın
- Enum -> by defult thread-safe 
- Enum lar sadece CONST tutmak için değildir. 
- Poka Yoke -> hata geçirmezlik -> generics
- Random sayı : ThradLocalRandom kullanın
- Heap pollution -> pass by ref. 


2021-12-16

- Optional
- assert --> Varsayımı teyit edin, vurgulu şekilde -> jvm (-ea)
    - Junit --> Junit Assert.isNull(...)
- jmeter --> Stress test   --> profilling --> Problem kırmak
- custom annotation yazabiliyoruz 
- @Override kullanın 
- instance of --> RTTI performansı kötüleştirir
- Hazelcast -> In memory Data grid -> DB gitmemeye calisin
- paralel() --> Hedef donanım gözetin
- current --> currenthashmap kullanın
- null haberleşmeyim
- exception ile haberleşmeyin
- exception 42-55 kat arası uygulamayı yavaslatir. 