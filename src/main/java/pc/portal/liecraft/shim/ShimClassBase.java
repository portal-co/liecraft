package pc.portal.liecraft.shim;

public class ShimClassBase <T extends HasShimClassBase>{
    public final T wrapped;

    public ShimClassBase(T wrapped) {
        this.wrapped = wrapped;
    }


}
