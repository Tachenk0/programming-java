import java.util.*;

public class fractioncomparable implements Comparator<fraction> {
    private final SortOrder order;

    public enum SortOrder {
        ASCENDING,
        DESCENDING,
        ABS_ASCENDING,
        ABS_DESCENDING
    }

    public fractioncomparable(SortOrder order) {
        this.order = order;
    }

    @Override
    public int compare(fraction f1, fraction f2) {
        switch (order) {
            case ASCENDING:
                return f1.compareTo(f2);
            case DESCENDING:
                return f2.compareTo(f1);
            case ABS_ASCENDING:
                return Double.compare(f1.getAbsoluteValue(), f2.getAbsoluteValue());
            case ABS_DESCENDING:
                return Double.compare(f2.getAbsoluteValue(), f1.getAbsoluteValue());
            default:
                throw new IllegalArgumentException("неизвестный тип для сортировки.");
        }
    }
}