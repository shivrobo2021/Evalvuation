# StockImageVideoFilter


StockImageVideoFilter is a mobile app that can be used to search for free stock
photos and videos. This app will allow the user to search for photos
and videos of their choice and also store the users favourite photos
and videos for later reference

**Architecture**:


![MVVM3](https://user-images.githubusercontent.com/1812129/68319232-446cf900-00be-11ea-92cf-cad817b2af2c.png)

Model-View-ViewModel (ie MVVM) is a template of a client application architecture, proposed by John Gossman as an alternative to MVC and MVP patterns when using Data Binding technology. Its concept is to separate data presentation logic from business logic by moving it into particular class for a clear distinction.




  ![mvvm2](https://user-images.githubusercontent.com/1812129/68319008-e9d39d00-00bd-11ea-9245-ebedd2a2c067.png)
  
  #### The app has following packages:
1. **data**: It contains all the data accessing and manipulating components.
2. **ui**: View classes along with their corresponding ViewModel.
3. **utils**: Utility classes.

#### Classes have been designed in such a way that it could be inherited and maximize the code reuse.

### Library reference resources:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. Glide:https://github.com/bumptech/glide
3. CircularImageView: https://github.com/hdodenhof/CircleImageView
4. Room: https://developer.android.com/topic/libraries/architecture/room.html

