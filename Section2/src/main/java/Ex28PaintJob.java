public class Ex28PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <0 ) {return -1;}
        double area = width * height;
        int howManyBuckets = (int) (area / areaPerBucket);
        if (howManyBuckets * areaPerBucket != area) {howManyBuckets+=1;}
        return howManyBuckets - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0  ) {return -1;}
        double area = width * height;
        int howManyBuckets = (int) (area / areaPerBucket);
        if (howManyBuckets * areaPerBucket != area) {howManyBuckets+=1;}
        return howManyBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0  ) {return -1;}
        int howManyBuckets = (int) (area / areaPerBucket);
        if (howManyBuckets * areaPerBucket != area) {howManyBuckets+=1;}
        return howManyBuckets;
    }
}
