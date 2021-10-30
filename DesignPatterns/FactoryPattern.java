enum CouponType {
    PERCENTAGE_DISCOUNT_ON_ALL, PERCENTAGE_DISCOUNT_ON_NEXT_ITEM, FIXED_DISCOUNT;
}

enum ItemType {
    PEN, POSTCARD, BOX, ERASER;
}

interface Coupon {
    public double getDiscountPrice();
}

class PercentageDiscountOnAllCoupon implements Coupon {

    int percentageDiscount;

    PercentageDiscountOnAllCoupon() {
        System.out.println("Coupon PercentageDiscountOnAllCoupon created\n");
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }



    public double getDiscountPrice() {
        return 0.0;
    }
}

class PercentageDiscountOnNextItemCoupon implements Coupon {

    int percentageDiscount;

    PercentageDiscountOnNextItemCoupon() {
        System.out.println("Coupon PercentageDiscountOnNextItemCoupon created\n");
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getDiscountPrice() {
        return 0.0;
    }
}

class FixedDiscountOnItem implements Coupon {

    ItemType itemType;
    int itemPosition;

    FixedDiscountOnItem() {
        System.out.println("Coupon FixedDiscountOnItem created\n");
    }

    public double getDiscountPrice() {
        return 0.0;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getItemPosition() {
        return itemPosition;
    }

    public void setItemPosition(int itemPosition) {
        this.itemPosition = itemPosition;
    }

 }

 class CouponFactory {

    public Coupon coupon;

    public Coupon getCoupon(CouponType type) {
        if (type == CouponType.PERCENTAGE_DISCOUNT_ON_ALL) {
            return new PercentageDiscountOnAllCoupon();
        }
        else if (type == CouponType.PERCENTAGE_DISCOUNT_ON_NEXT_ITEM) {
            return new PercentageDiscountOnNextItemCoupon();
        }
        else if (type == CouponType.FIXED_DISCOUNT) {
            return new FixedDiscountOnItem();
        }
        return null;
    }
 }

 public class Suraj {
     public static void main(String[] args) {

         CouponFactory factory = new CouponFactory();
         Coupon c = factory.getCoupon(CouponType.FIXED_DISCOUNT);
         Coupon c1 = factory.getCoupon(CouponType.PERCENTAGE_DISCOUNT_ON_ALL);
         Coupon c2 = factory.getCoupon(CouponType.PERCENTAGE_DISCOUNT_ON_NEXT_ITEM);
     }
 }