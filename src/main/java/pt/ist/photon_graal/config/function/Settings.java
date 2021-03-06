package pt.ist.photon_graal.config.function;

import lombok.Data;

@Data
public class Settings {
    private final String classFQN;
    private final String methodName;
    private final Boolean isStatic;

    public Settings(String classFQN, String methodName) {
        this(classFQN, methodName, false);
    }

    public Settings(String classFQN, String methodName, Boolean isStatic) {
        this.classFQN = classFQN;
        this.methodName = methodName;
        this.isStatic = isStatic;
    }

    public boolean isStatic() {
        return isStatic != null && isStatic;
    }

    @Override
    public String toString() {
        return classFQN + "::" + methodName;
    }

    public String simplifiedName() {
        final String[] split = classFQN.split("\\.");
        return split[split.length - 1];
    }
}
