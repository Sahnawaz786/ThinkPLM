import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Container from './Components/Container';


function App() {
  return (
    <div className="App">
      <Router>
       <Container/>
        <Routes>
          <Route path="/details" element={<></>} />
          <Route path="/create-supplier" element={<></>} />
          <Route path="/onboard-status" element={<></>} />
          <Route path="/contract-details" element={<></>} />
          <Route path="/create-part" element={<></>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
