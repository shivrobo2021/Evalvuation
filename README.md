# StockImageVideoFilter


StockImageVideoFilter is a mobile app that can be used to search for free stock
photos and videos. This app will allow the user to search for photos
and videos of their choice and also store the users favourite photos
and videos for later reference

**Architecture**:


![MVVM3](https://user-images.githubusercontent.com/1812129/68319232-446cf900-00be-11ea-92cf-cad817b2af2c.png)

Model-View-ViewModel (ie MVVM) is a template of a client application architecture, proposed by John Gossman as an alternative to MVC and MVP patterns when using Data Binding technology. Its concept is to separate data presentation logic from business logic by moving it into particular class for a clear distinction.



**MVVM Best Pratice:**
- Avoid references to Views in ViewModels.
- Instead of pushing data to the UI, let the UI observe changes to it.
- Distribute responsibilities, add a domain layer if needed.
- Add a data repository as the single-point entry to your data.
- Expose information about the state of your data using a wrapper or another LiveData.
- Consider edge cases, leaks and how long-running operations can affect the instances in your architecture.
- Don’t put logic in the ViewModel that is critical to saving clean state or related to data. Any call you make from a ViewModel can be the last one.



**Keep your code clean according to MVVM**
-----------------------------
 - For livedate which will emit data stream , it has to be in your
   data layer , and don't inform those observables any thing else like
   in which thread those will consume , cause it is another
 - For livedata which will emit UI binding events, it has to be in your ViewModel Layer.
 - Observers in UI Consume and react to live data values and bind it.
   responsibility , and according to `Single responsibility principle`
  in `SOLID (object-oriented design)` 

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

