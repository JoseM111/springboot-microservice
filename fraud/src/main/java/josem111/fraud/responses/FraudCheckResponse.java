package josem111.fraud.responses;

public record FraudCheckResponse(Boolean isFraudster) {
    /**
     * A record class declares the following members automatically:
     *
     * For each component in the header, the following two members:
     * A private final field with the same name and declared type as
     * the record component. This field is sometimes referred to as
     * a component field.
     * A public accessor method with the same name and type of the
     * component; in the Rectangle record class example, these methods
     * are Rectangle::length() and Rectangle::width().
     * A canonical constructor whose signature is the same as
     * the header. This constructor assigns each argument from the new
     * expression that instantiates the record class to the corresponding
     * component field.
     * Implementations of the equals and hashCode methods, which specify
     * that two record classes are equal if they are of the same type and
     * contain equal component values.
     * An implementation of the toString method that includes the string
     * representation of all the record class's components, with their
     * names.
     */
}









