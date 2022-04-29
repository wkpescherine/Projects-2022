import React from 'react';
import './App.css';
import {Link} from 'react-router-dom'


function CreateAccount() {
    React.state = {
        username:"none",
        password:"none"
    }
    
    React.handleUsernameChange = event => {
        this.setState({
            username: event.target.value
          })
    }

    React.handlePasswordChange = event => {
        this.setState({
            passowrd: event.target.value
          })
    }

    React.handleLogIn =() =>{
        console.log("Logged In")
    }
    
    return (
        <div>
            <p>Username</p>
            <p>
                <input type="text" placeholder="Enter username" onChange={event => this.handleUsernameChange(event)}></input>
            </p>
            <p>Password</p>
            <p>
                <input type="text" placeholder="Enter password" onChange={event => this.handlePasswordChange(event)}></input>
            </p>
            <p>
                <Link to={"/home"}>
                    <button onClick={()=>this.handleLogIn}>Create</button>    
                </Link>
            </p>
            <p>
                <Link to={"/"}>
                    <button>Home</button>
                </Link>    
            </p>
        </div>
    );
}

export default CreateAccount;