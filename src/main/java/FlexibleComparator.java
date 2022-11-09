public class FlexibleComparator implements Comparator <Animal> {

    private String sortBy;

    public FlexibleComparator (String sortBy) {
        this.sortBy = sortBy;
    }



    @Override
    public int compare (Animal o1, Animal o2) {
        switch (sortBy) {
            case "type" -> {return o1.getType().compareTo(o2.getType());

            }

            case "age" -> {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            case "name" -> {
                return o1.getAge()
            }
        }
    }
}
