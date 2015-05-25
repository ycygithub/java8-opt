package opt;

/**
 * Created by Dell 1 on 15-5-13.
 */
public class RepeatAnnotationOld {

    public @interface Authority {
        String role();
    }

    public @interface Authorities {
        Authority[] value();
    }

    public class RepeatAnnotationUseOldVersion {

        @Authorities({@Authority(role="Admin"),@Authority(role="Manager")})
        public void doSomeThing(){ }

    }

}
