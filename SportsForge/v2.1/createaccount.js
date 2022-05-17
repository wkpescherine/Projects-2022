import React from 'react';
import './App.css';
import {Link} from 'react-router-dom'

export default function CreateAccount() {
    React.state = {
        username:"none",
        password:"none",
        email:"none"
    }
    
    React.handleUsernameChange = event => {
        this.setState({
            username: event.target.value
          })
          console.log(this.state.username)
    }

    React.handlePasswordChange = event => {
        this.setState({
            passowrd: event.target.value
          })
    }

    React.handleEmailChange = event => {
        this.setState({
            email: event.target.value
        })
    }

    // */React.handleLogIn(){
    //    fetch("https://api.apispreadsheets.com/data/RPYeHPoUSzV3TdA6/", {
    //        method: "POST",
      //      body: JSON.stringify({"data": {"CC#":"","Type":"","Email":"","Password":"","UserName":"","credits_used":"","total_credits":"","credits_current":""}}),
      //  }).then(res =>{
        //    if (res.status === 201){
                // SUCCESS
          //      console.log("Success")
            //}
//            else{
                // ERROR
    //            console.log("Error")
  //          }
    //    })
    //}

    //this does work as a function within a function
    function testThis(){
        console.log("Some thing")
    }
    
    return (
        <div>
            <p> 
                Username -  
                <input type="text" placeholder="Enter username" onChange={event => this.handleUsernameChange(event)}></input>
            </p>
            <p>
                Password -
                <input type="text" placeholder="Enter password" onChange={event => this.handlePasswordChange(event)}></input>
            </p>
            <p>
                Email -
                <input type="text" placeholder="Enter password" onChange={event => this.handleEmailChange(event)}></input>
            </p>
            <p>
                <Link to={"/dashboard"}>
                    <button onClick={()=>testThis()}>Create</button>    
                </Link>
            </p>
            <p>
                <Link to={"/"}>
                    <button>Back</button>
                </Link>    
            </p>
        </div>
    );
}