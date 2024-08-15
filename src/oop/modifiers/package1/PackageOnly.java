package oop.modifiers.package1;

// No "public" modifier means this class can only be used by classes in the same package.
class PackageOnly {

    // No "public" modifier means this field can only be used by classes in the same package.
    static String text = "I am PackageOnly.";
}
