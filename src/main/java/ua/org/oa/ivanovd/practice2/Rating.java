package ua.org.oa.ivanovd.practice2;

/**
 * Created by Администратор on 09.06.2016.
 */
public class Rating {

    private int rank;
    private String MaleName;
    private String FemaleName;

    public Rating(int rank, String maleName, String femaleName) {
        this.rank = rank;
        this.MaleName = maleName;
        this.FemaleName = femaleName;
    }

    @Override
    public String toString() {
        return "Rank = " + rank
                + ", Male name = " + MaleName
                + ", Female name = " + FemaleName + ';';
    }
}
