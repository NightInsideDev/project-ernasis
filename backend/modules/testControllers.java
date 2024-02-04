public class UserController {

    @PostMapping("/")
    public void create(@Valid @RequestBody UserEntity userEntity) {

        System.out.println("User");
        System.out.println(userEntity.getName());

    }
    
}
