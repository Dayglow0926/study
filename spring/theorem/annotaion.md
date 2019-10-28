## @Autowired

* DI에 사용되는 annotation

## @DistiesContext

* 스프링의 테스트 컨텍스트 프레임워크에게 해당 클래스의 테스트에서 애플리케이션 컨텍스트의 상태를 변경한다는 것을 알려준다.
* 이 annotation이 있을 경우 테스트 클래스에서 applcationContext의 공유를 허용하지 않는다.
* 테스트 메소드 마다 새로운 applicationContext를 만든다.
* 클래스에만 적용할 수 있는게 아니다.
    * 일부 메소드에서만 이 기능이 필요할 경우 메소드 단위로 붙여주는게 좋다.
    * 즉, 특정 메소드에서 컨텍스트 상태를 변경한다면 그 메소드에만 붙여주는게 좋다.