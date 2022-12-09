import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import './App.css';
import { useState } from 'react';
// import Generate from './Generate';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <nav>
        <ul>
          <li><Link to='/'>Home</Link></li>
          <li><Link to="/get_magic_number">Click here to know your magic number</Link></li>
        </ul>
        
        
      </nav>
        <Routes>
          <Route path='/' element = {<Home/>}></Route>
          <Route path = "/get_magic_number" element={<Generate/>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}
function Generate(){
  const [value, setValue] = useState(0);
const handleClick = () => {
  let randomNum = Math.floor(Math.random() * 100)
  setValue(randomNum);
}

  return (
    <div>
      <button onClick={handleClick}>Get Magic Number</button>
      <h2>Your magic number is {value}</h2>
    </div>

  );


}



export default App;

function Home(){
  return <div>Home</div>
}
