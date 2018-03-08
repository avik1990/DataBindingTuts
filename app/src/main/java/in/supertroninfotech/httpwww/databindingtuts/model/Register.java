package in.supertroninfotech.httpwww.databindingtuts.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextWatcher;

import in.supertroninfotech.httpwww.databindingtuts.BR;
import in.supertroninfotech.httpwww.databindingtuts.R;
import in.supertroninfotech.httpwww.databindingtuts.helper.SimpleTextWatcher;

/**
 * Created by User1 on 02-03-2018.
 */
public class Register extends BaseObservable {
    public String name;
    public String password;
    public String type;
    public String gender;
    public String privacy_policy;

   /* public Register(String name, String password, String type, String gender, String privacy_policy) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.gender = gender;
        this.privacy_policy = privacy_policy;
    }

    public Register() {
    }*/

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;
       /* setName(name);
        notifyPropertyChanged(R.id.et_name);*/
        setNameAtomic(name);
    }

    public void setNameAtomic(String name) {
        //this.name = name;
       this.name=name;
       // notifyPropertyChanged(R.id.et_name);
    }


    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //this.password = password;
        setPassword(password);
        notifyPropertyChanged(R.id.et_password);
    }

    @Bindable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        notifyPropertyChanged(R.id.sp_data);
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(R.id.rg_gender);
    }

    @Bindable
    public String getPrivacy_policy() {
        return privacy_policy;
    }

    public void setPrivacy_policy(String privacy_policy) {
        this.privacy_policy = privacy_policy;
        notifyPropertyChanged(R.id.chk_privacy);
    }

    public TextWatcher onBasicChanged = new SimpleTextWatcher() {
        @Override
        public void onTextChanged(String newBasic) {
            setNameAtomic(newBasic);
        }
    };



    public TextWatcher onBasicChanged1 = new SimpleTextWatcher() {
        @Override
        public void onTextChanged(String newBasic) {
            setPassword(newBasic);
        }
    };



}
