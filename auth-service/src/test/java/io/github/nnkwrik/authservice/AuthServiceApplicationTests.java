package io.github.nnkwrik.authservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceApplicationTests {

    @Test
    public void contextLoads() {


        String a = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCQa06/5dvM+UpeFRogwuNPZJVOD+s3hAQGWSlhCbLw+gGihpNmOlUQgmqdYwWN6DEkElzW/VddfO6l7VfE++OppfExqxxuJj8wlxDiizXf/PDIMUioeS4kO/jg4IM7pnL0G5BD7EJMaCCHbWvuRV705MJczuds1EXqerOa3Mx2lTRFKYHCN1ehfEzrkPoBBtWy69UeVGhf04RvyoS80yBBZtgoRRf115g8cDE8iAWm/J9nQdy1OcqUja6AE1YOBihEa/wj74PvWKleMlEagxKtGlRSmYzgQytEQXKjd8+rDZoes7JXbqvYhvspTDuxD/Slfj1ibPC+Py/crIRKo9YDAgMBAAECggEARdgPwtDYp13c8HlGJJf8NPZRGuqp+DRZefR/BZYaO169kauB98u4Pf7Erw8nrYSg13AmBDeLnAQCqq6JZxPm+7HsXvgBDOhkYQx+NwHacVQz4q2rFQdeIFn8uEz8SsnqCFKYR7EoMymcqcJqk1ZrYQaNVTMfS0ux8H+dAwVLwQEW6AK2S1wN3G6m3FjBllgm0/ZgM4c3Ag2Qz0FBPwbP/ZaVrRRQ0CMZkM6GHjKOVj/nzNEMX37Xc8XA69qwpur+jyv7GPQ7pBx3Vrz0PZyKSuR4Djv6eXGwSU6Ssh5szQWcRzTDG/OQX30VpWA6vGLD47zSioAq9phOXipERHqjAQKBgQDTwQaKDhZ3+jVamUrAvxshZrAgyfosyRcbbR/OyvdC3RjSqkQ6ByElAX4UWMFQhJFsQlMwOiQudpFaN8bm/az9PLT6NDJAnOMplKIIpncJpSvpczej0StZ4WqADzjH/WaF3hLwYj5goB1sD6/RTFv0xVqLP6HZ9+jtHHVwy8YSgwKBgQCumHYcDruzFrovxWYOOwh9QJGDUbMqAtmPpvPBQiKxFhlI4ZWnZq5Ldb7XPHCcVOPODhNfwM2evsnmJdhlU4DSfShuM24KA1w27mqg199KIMMLY43Pp0c7Y3JRAGNSDkADrhIdldvQZKum3/2lOq6/S8aQ43CXN4R+YzIKa0nWgQKBgQDFkdSjHI/UM2xycpIvkl8i4+ezQCAehyT7Hu7Nh8v548ZUUC7GIX7IQ0M6grEjif0REDUDy0uU2mW10lLPlKJByNFmnSrB5F+CnT4tafuo0SZOc4TXYMLc4pf2kb09w21Tu6baCCABEYNCHsTBOEiX8UcQozdE4qy+Bo6Axm+xNwKBgCn6VCNo0246n6dOsbvoK6FZveKx6P7H0qE8Rc0IZqjnJEsmmcG26V8RP0ImsPiVXHQ1ZCkYhReOzaI9JSsviYCSQP9F9EYKCsjWR+LGJFSBTgPV+smbcX/w6BJbooWfEXsRBiAA4OnY2oBzyFtKoasyv9okJPTmjz+IAAcLRqSBAoGBAMHOyiJ3gRUdbk6pyyKAHxB1GZ0iLXX+e7YauHZj2/nNyqWGoAUXk1rf/kDtn3wt9Juyo7pCLiAnjRhPTHDCKtOYGPNoKNADLrXObUMVSAe6JiH+/GTtk2OeH+e6PFNvpG25N2KrX4cu5cJ7SPphxTiqJn2VB8RGcSwlfFFMJXDC";
        String[] split = a.split(".");
        System.out.println(split.length);
    }

}
