import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Product> productsList = new ArrayList<>();
//
//        productsList.add(new Product(1, "HP Laptop", 25000f));
//        productsList.add(new Product(2, "Dell Laptop", 30000f));
//        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
//        productsList.add(new Product(4, "Sony Laptop", 28000f));
//        productsList.add(new Product(5, "Apple Laptop", 90000f));
//
//        List<Float> collect = productsList.stream()
//                .filter(product -> product.getPrice() > 25000)
//                .map(Product::getPrice)  // Agar map olib tashlansa List<Product>, aks holda List<Float> ya`ni price yig`iladi.
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

//        //1
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        stream.forEach(System.out::println);
//
//        //2
//        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        stream1.forEach(System.out::println);
//
//        //3
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            list.add(i);
//        }
//        Stream<Integer> stream2 = list.stream();
//        stream2.forEach(System.out::println);

//        //4
//        Stream<Integer> generate = Stream.generate(() -> (new Random()).nextInt(100));
//        generate.limit(20).forEach(System.out::println);

//        //5
//        IntStream chars = "asdasd_123".chars();
//        chars.forEach(System.out::println);

        //6
//        Stream<String> stringStream = Stream.of("A?B?C".split("\\?"));
//        stringStream.forEach(System.out::println);

        //7
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> collect = stream.filter(num -> num % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

        //8
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer[] integers = stream.filter(num -> num % 2 == 0).toArray(Integer[]::new);
//        System.out.println(Arrays.toString(integers));

        //9
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        List<String> q = names.stream()
//                .filter(n -> n.endsWith("a") && n.startsWith("Q"))
//                .collect(Collectors.toList());
//        System.out.println(q);

        //10
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        names.stream().filter(n -> n.startsWith("K") || n.endsWith("r")).forEach(System.out::println);

        //11
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        names.stream().filter(n->n.startsWith("Q")).map(String::toUpperCase).forEach(System.out::println);

        //12
//        List<String> names = new ArrayList<>(List.of("asd", "lfkfgfg", "sdf", "ert", "ythjthgfh"));
//        names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        //13
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

        //14
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qa", "Qanaqa", "Qancha"));
//        names.stream().sorted(String::compareTo).collect(Collectors.toList()).forEach(System.out::println); // (Kim Nima Qa Qanaqa Qancha)

        //15
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        boolean q = names.stream().anyMatch((n) -> n.startsWith("K"));
//        System.out.println(q);  //(true)

        //16
//        List<String> names = new ArrayList<>(List.of( "Qayer", "Qanaqa", "Qancha"));
//        boolean q = names.stream().allMatch((n) -> n.startsWith("Q"));
//        System.out.println(q);  //(true)

        //17
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        boolean q = names.stream().noneMatch((n) -> n.startsWith("A"));
//        System.out.println(q);  //(true)

        //18
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        long n = names.stream().filter(s -> s.endsWith("a")).count();
//        System.out.println(n); // (3)

        //19
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        Optional<String> reduce = names.stream().reduce((s1, s2) -> s1 + " # " + s2);
//        reduce.ifPresent(System.out::println);  // (Kim # Nima # Qayer # Qanaqa # Qancha)

        //20
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        String q = names.stream().filter(n -> n.startsWith("Q")).findFirst().get();
//        System.out.println(q);  //(Qayer)

        //21
//        List<String> names = new ArrayList<>(List.of("Kim", "Nima", "Qayer", "Qanaqa", "Qancha"));
//        names.stream().filter(n->n.startsWith("Q")).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        //22
//        List<Product> products = Arrays.asList(
//                new Product(1, "Alex", 100f),
//                new Product(2, "Brian", 100f),
//                new Product(3, "Charles", 200f),
//                new Product(4, "David", 200f),
//                new Product(5, "Edward", 300f),
//                new Product(6, "Frank", 300f)
//        );
//
//        products.stream().map(Product::getPrice).distinct().collect(Collectors.toList()).forEach(System.out::println);

//        List<Integer> nums1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        List<Integer> nums2=new ArrayList<>(Arrays.asList(6,7,8,9,10));
//        List<Integer> nums3=new ArrayList<>(Arrays.asList(11,12,13,14,15));
//        List<List<Integer>> lists = Arrays.asList(nums1, nums2, nums3);
//
//        lists.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

//        String [][] nums=new String[][]{{"1","2","3"},{"4","5","6"},{"7","8","9"}};
//        List<String> collect = Arrays.stream(nums).flatMap(Arrays::stream).collect(Collectors.toList());
//        collect.forEach(System.out::println);

//        List<Integer> numbers=new ArrayList<>(Arrays.asList(3,2,1,6,5,4,9,8,7));
//        List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> numbers=new ArrayList<>(Arrays.asList(3,2,1,6,5,4,9,8,7));
//        List<Integer> collect = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> numbers=new ArrayList<>(Arrays.asList(3,2,1,6,5,4,9,8,7));
//        List<Integer> collect = numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
//        System.out.println(collect);
//
//        List<Integer> numberss=new ArrayList<>(Arrays.asList(3,2,1,6,5,4,9,8,7));
//        List<Integer> collects = numberss.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(collects);

//        List<Integer> numbers=new ArrayList<>(Arrays.asList(3,2,1,6,5,4,9,8,7));
//        List<Integer> collect = numbers.stream().peek(System.out::println).collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        numbers.stream().sorted().filter(n -> n % 2 == 0).limit(2).collect(Collectors.toList()).forEach(System.out::println);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        numbers.stream().sorted().filter(n -> n % 2 == 0).skip(2).collect(Collectors.toList()).forEach(System.out::println);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        numbers.stream().parallel().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
//        System.out.println(min.get());

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//        System.out.println(max.get());

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        Long collect = numbers.stream().filter(n -> n % 2 == 0).count();
//        System.out.println(collect);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));
//        Long collect = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.counting());
//        System.out.println(collect);

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7, 10));


        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1, "PRODUCT1", 100F),
                new Product(2, "PRODUCT2", 200F),
                new Product(3, "PRODUCT3", 300F),
                new Product(4, "PRODUCT4", 400F),
                new Product(5, "PRODUCT5", 500F)));

        List<Product> collect = products.stream()
                .peek(p -> p.setName(p.getName().toLowerCase()))
                .map(Main::multPrice)
                .filter(p -> p.getPrice() > 200)
                .collect(Collectors.toList());
        System.out.println(products);
        System.out.println(collect);

    }

    public static Product multPrice(Product product) {
        if (product == null) {
            return new Product();
        }
        product.setPrice(product.getPrice() * 2);
        return product;
    }

}
